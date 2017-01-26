package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_331 {
    private final Production59_331 production = new Production59_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}