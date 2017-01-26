package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_75 {
    private final Production97_75 production = new Production97_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}