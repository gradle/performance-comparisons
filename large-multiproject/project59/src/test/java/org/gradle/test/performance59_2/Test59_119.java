package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_119 {
    private final Production59_119 production = new Production59_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}