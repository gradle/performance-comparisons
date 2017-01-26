package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_71 {
    private final Production59_71 production = new Production59_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}