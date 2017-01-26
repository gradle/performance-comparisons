package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_495 {
    private final Production97_495 production = new Production97_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}