package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_209 {
    private final Production97_209 production = new Production97_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}