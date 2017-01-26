package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_445 {
    private final Production97_445 production = new Production97_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}