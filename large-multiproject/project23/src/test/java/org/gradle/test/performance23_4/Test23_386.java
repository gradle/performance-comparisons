package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_386 {
    private final Production23_386 production = new Production23_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}