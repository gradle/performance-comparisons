package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_204 {
    private final Production34_204 production = new Production34_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}