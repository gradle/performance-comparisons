package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_225 {
    private final Production59_225 production = new Production59_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}