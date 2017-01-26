package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_183 {
    private final Production91_183 production = new Production91_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}