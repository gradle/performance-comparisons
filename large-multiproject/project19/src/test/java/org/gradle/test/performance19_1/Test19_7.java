package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_7 {
    private final Production19_7 production = new Production19_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}