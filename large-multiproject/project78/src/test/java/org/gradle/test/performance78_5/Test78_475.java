package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_475 {
    private final Production78_475 production = new Production78_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}