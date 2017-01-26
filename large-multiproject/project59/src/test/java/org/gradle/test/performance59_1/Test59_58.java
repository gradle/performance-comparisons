package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_58 {
    private final Production59_58 production = new Production59_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}