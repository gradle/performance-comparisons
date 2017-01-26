package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_229 {
    private final Production34_229 production = new Production34_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}