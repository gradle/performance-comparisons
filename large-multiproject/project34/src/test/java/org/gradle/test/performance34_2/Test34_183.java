package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_183 {
    private final Production34_183 production = new Production34_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}