package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_29 {
    private final Production34_29 production = new Production34_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}