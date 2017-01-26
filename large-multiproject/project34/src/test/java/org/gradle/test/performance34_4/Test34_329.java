package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_329 {
    private final Production34_329 production = new Production34_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}