package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_71 {
    private final Production97_71 production = new Production97_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}