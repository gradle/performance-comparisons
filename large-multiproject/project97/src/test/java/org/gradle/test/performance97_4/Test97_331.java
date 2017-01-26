package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_331 {
    private final Production97_331 production = new Production97_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}