package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_294 {
    private final Production59_294 production = new Production59_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}