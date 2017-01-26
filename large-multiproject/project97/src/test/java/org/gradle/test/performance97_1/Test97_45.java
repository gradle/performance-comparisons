package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_45 {
    private final Production97_45 production = new Production97_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}