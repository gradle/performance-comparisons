package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_266 {
    private final Production59_266 production = new Production59_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}