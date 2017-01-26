package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_9 {
    private final Production97_9 production = new Production97_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}