package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_66 {
    private final Production59_66 production = new Production59_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}