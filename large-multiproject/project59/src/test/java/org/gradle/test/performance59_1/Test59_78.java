package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_78 {
    private final Production59_78 production = new Production59_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}