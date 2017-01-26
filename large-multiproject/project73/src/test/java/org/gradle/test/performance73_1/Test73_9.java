package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_9 {
    private final Production73_9 production = new Production73_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}