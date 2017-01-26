package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_309 {
    private final Production34_309 production = new Production34_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}