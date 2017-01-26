package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_209 {
    private final Production59_209 production = new Production59_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}