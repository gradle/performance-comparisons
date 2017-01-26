package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_257 {
    private final Production91_257 production = new Production91_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}