package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_72 {
    private final Production59_72 production = new Production59_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}