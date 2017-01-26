package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_257 {
    private final Production34_257 production = new Production34_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}