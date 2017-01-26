package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_353 {
    private final Production63_353 production = new Production63_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}