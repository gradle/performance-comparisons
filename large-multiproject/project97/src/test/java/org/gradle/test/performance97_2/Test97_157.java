package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_157 {
    private final Production97_157 production = new Production97_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}