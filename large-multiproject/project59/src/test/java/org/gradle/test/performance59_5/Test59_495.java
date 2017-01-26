package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_495 {
    private final Production59_495 production = new Production59_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}