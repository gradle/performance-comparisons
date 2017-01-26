package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_417 {
    private final Production78_417 production = new Production78_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}