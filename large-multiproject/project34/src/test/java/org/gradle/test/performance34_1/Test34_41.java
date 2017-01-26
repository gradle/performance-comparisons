package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_41 {
    private final Production34_41 production = new Production34_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}