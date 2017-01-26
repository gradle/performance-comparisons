package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_88 {
    private final Production34_88 production = new Production34_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}