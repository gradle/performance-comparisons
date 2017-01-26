package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_212 {
    private final Production34_212 production = new Production34_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}