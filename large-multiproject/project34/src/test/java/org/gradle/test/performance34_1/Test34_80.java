package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_80 {
    private final Production34_80 production = new Production34_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}