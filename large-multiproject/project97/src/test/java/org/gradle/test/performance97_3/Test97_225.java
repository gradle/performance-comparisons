package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_225 {
    private final Production97_225 production = new Production97_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}