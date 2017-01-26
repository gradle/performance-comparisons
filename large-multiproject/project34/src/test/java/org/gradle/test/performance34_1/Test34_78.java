package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_78 {
    private final Production34_78 production = new Production34_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}