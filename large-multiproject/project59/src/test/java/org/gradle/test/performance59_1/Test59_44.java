package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_44 {
    private final Production59_44 production = new Production59_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}