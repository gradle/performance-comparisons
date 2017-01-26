package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_202 {
    private final Production34_202 production = new Production34_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}