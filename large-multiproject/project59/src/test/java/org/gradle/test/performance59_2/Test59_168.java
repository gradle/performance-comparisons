package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_168 {
    private final Production59_168 production = new Production59_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}