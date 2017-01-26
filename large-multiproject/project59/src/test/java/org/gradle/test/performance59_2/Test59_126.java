package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_126 {
    private final Production59_126 production = new Production59_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}