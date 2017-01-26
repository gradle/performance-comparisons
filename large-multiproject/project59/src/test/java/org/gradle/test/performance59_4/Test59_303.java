package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_303 {
    private final Production59_303 production = new Production59_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}