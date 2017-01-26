package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_60 {
    private final Production19_60 production = new Production19_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}