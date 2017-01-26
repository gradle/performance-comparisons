package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_166 {
    private final Production78_166 production = new Production78_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}