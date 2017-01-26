package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_71 {
    private final Production73_71 production = new Production73_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}