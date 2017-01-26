package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_167 {
    private final Production34_167 production = new Production34_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}