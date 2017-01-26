package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_5 {
    private final Production19_5 production = new Production19_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}