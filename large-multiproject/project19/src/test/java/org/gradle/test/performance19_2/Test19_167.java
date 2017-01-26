package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_167 {
    private final Production19_167 production = new Production19_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}