package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_62 {
    private final Production59_62 production = new Production59_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}