package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_58 {
    private final Production34_58 production = new Production34_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}