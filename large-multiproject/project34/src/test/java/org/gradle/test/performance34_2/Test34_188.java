package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_188 {
    private final Production34_188 production = new Production34_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}