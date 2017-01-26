package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_44 {
    private final Production34_44 production = new Production34_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}