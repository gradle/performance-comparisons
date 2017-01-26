package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_167 {
    private final Production59_167 production = new Production59_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}