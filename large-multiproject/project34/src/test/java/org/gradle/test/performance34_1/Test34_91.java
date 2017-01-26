package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_91 {
    private final Production34_91 production = new Production34_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}